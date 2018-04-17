package com.aitravelba.test;

import java.util.List;

import com.alibaba.rocketmq.client.producer.DefaultMQProducer;
import com.alibaba.rocketmq.client.producer.MessageQueueSelector;
import com.alibaba.rocketmq.client.producer.SendResult;
import com.alibaba.rocketmq.common.message.Message;
import com.alibaba.rocketmq.common.message.MessageQueue;

/**
 * 
 * @desc test rocket mq
 * @Author wenpeng
 * @2018年3月19日 下午6:23:34
 */
public class MqProducer {

	public static void main(String[] args)throws Exception {

		DefaultMQProducer producer = new DefaultMQProducer("wp_group");
		producer.setNamesrvAddr("10.40.2.212:9876");
		producer.setVipChannelEnabled(false);
		//producer.setRetryTimesWhenSendAsyncFailed(5);
		producer.start();
		for(int i=1;i<=10;i++) {
			Message msg = new Message("wp_topic", "wp_tag",("Hello Rocket Mq "+i).getBytes());
			SendResult ret = producer.send(msg, new MessageQueueSelector() {
				
				@Override
				public MessageQueue select(List<MessageQueue> mqs, Message msg, Object arg) {
					System.out.println("arg = "+arg);
					Integer id = (Integer)arg;
					int idx = id%mqs.size();
					return mqs.get(idx);
				}
			}, i*2);
			System.out.println(ret);
			Thread.sleep(1000);
		}
		producer.shutdown();
	}

}
