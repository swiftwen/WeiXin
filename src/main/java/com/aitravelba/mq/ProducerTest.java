package com.aitravelba.mq;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.alibaba.rocketmq.client.exception.MQBrokerException;
import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.client.producer.DefaultMQProducer;
import com.alibaba.rocketmq.client.producer.MessageQueueSelector;
import com.alibaba.rocketmq.client.producer.SendResult;
import com.alibaba.rocketmq.common.message.Message;
import com.alibaba.rocketmq.common.message.MessageQueue;
import com.alibaba.rocketmq.remoting.exception.RemotingException;

/**
 * 
 * @author swiftwen
 * @date 2019年5月14日 上午11:31:17
 */
public class ProducerTest {

	public static void main(String[] args) {
		try {
            DefaultMQProducer producer = new DefaultMQProducer("please_rename_unique_group_name");
 
            producer.setNamesrvAddr("47.106.206.152:9876");
 
            
            producer.start();
            producer.setVipChannelEnabled(false);
            String[] tags = new String[] { "TagA", "TagC", "TagD" };
 
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateStr = sdf.format(date);
            for (int i = 0; i < 10; i++) {
                // 加个时间后缀
                String body = dateStr + " Hello RocketMQ " + i;
                Message msg = new Message("TopicTestjjj", tags[i % tags.length], "KEY" + i, body.getBytes());
 
                SendResult sendResult = producer.send(msg, new MessageQueueSelector() {
                    @Override
                    public MessageQueue select(List<MessageQueue> mqs, Message msg, Object arg) {
                        Integer id = (Integer) arg;
                        return mqs.get(id);
                    }
                }, 0);//0是队列的下标
 
                System.out.println(sendResult + ", body:" + body);
            }
 
            producer.shutdown();
        } catch (MQClientException e) {
            e.printStackTrace();
        } catch (RemotingException e) {
            e.printStackTrace();
        } catch (MQBrokerException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
}
