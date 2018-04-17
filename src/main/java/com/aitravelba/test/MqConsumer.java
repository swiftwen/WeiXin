package com.aitravelba.test;

import java.util.List;

import com.alibaba.rocketmq.client.consumer.DefaultMQPushConsumer;
import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import com.alibaba.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import com.alibaba.rocketmq.common.consumer.ConsumeFromWhere;
import com.alibaba.rocketmq.common.message.MessageExt;

/**
 * 
 * @desc 
 * @Author wenpeng
 * @2018年3月19日 下午7:36:57
 */
public class MqConsumer {

	public static void main(String[] args) throws Exception{

		DefaultMQPushConsumer pushConsumer = new DefaultMQPushConsumer("wp_group");
		pushConsumer.setNamesrvAddr("10.40.2.212:9876");
		pushConsumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);
		pushConsumer.subscribe("wp_topic", "wp_tag");
		pushConsumer.setVipChannelEnabled(false); 
		//pushConsumer.setConsumeMessageBatchMaxSize(10);
		
		pushConsumer.registerMessageListener(new MessageListenerConcurrently() {
			@Override
			public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs, ConsumeConcurrentlyContext context) {
				System.out.println("in message"+"--------------------------");
				for(MessageExt msg : msgs) {
					System.out.println("****************"+new String(msg.getBody()));
				}
				return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
			}
		});
		pushConsumer.start();
		
		Thread.sleep(5000);  
		System.out.println("***********shutdown");
        //5秒后挂载消费端消费  
		//pushConsumer.suspend(); 
	}

}
