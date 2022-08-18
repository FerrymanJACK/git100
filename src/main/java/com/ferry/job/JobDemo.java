package com.ferry.job;

//import com.xxl.job.core.biz.model.ReturnT;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

//import com.xxl.job.core.biz.model.ReturnT;
//import com.xxl.job.core.handler.annotation.XxlJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * XxlJob开发示例（Bean模式）
 *
 * 开发步骤：
 * 1、在Spring Bean实例中，开发Job方法，方式格式要求为 "public ReturnT<String> execute(String param)"
 * 2、为Job方法添加注解 "@XxlJob(value="自定义jobhandler名称", init = "JobHandler初始化方法", destroy = "JobHandler销毁方法")"，注解value值对应的是调度中心新建任务的JobHandler属性的值。
 * 3、执行日志：需要通过 "XxlJobLogger.log" 打印执行日志；
 */
@Component
@EnableScheduling
public class JobDemo{
    private static final Logger logger = LoggerFactory.getLogger(JobDemo.class);
    /**
     * 1、简单任务示例（Bean模式）
     */
    //@XxlJob("demoJobHandler")
    //public ReturnT<String> demoJobHandler(String param) throws Exception {
    //
    //    logger.info("测试任务1被触发了");
    //    //        XxlJobLogger.log("测试任务1被触发了");
    //    return ReturnT.SUCCESS;
    //}
    //
    //@XxlJob("helloJob")
    //public ReturnT<String> helloJobHandler(String param) throws Exception {
    //    System.out.println("定时任务helloJob被执行了-----------");
    //    return ReturnT.SUCCESS;
    //}

}

