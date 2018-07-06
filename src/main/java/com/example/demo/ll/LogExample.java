package com.example.demo.ll;
import java.util.logging.Logger;

import org.hibernate.validator.internal.util.logging.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.apachecommons.CommonsLog;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

/**
 * 有一个问题就是如果是@Log，则无法使用log.info 等
 * 而@Slf4j可以
 * 
 * 问题的原因在与其实现是有不同的
 * @Log的实现是logger中的log，其没有error方法
 * 只有info方法
 * @author liulei50
 * 
 * 但是其实lombok网站上发的
 * 确实是@Log log.error();
 *
 */

//2018-07-05 16:53:31,672 [main] ERROR com.example.demo.ll.LogExample - somthing else is wrong here
//@Slf4j
//public class LogExample {
//	public static void main(String[] args) {
//		log.error("somthing else is wrong here");
//		
//	}
//}

//
//@Log
//public class LogExample {
//	public static void main(String[] args) {
//		//log.error("somthing else is wrong here");
////	    log.info("dasd");	
//		
//	
//	}
//}

//[main] ERROR CounterLog - somthing else is wrong here
/**
 * topic的目的就是代替包名
 * @author liulei50
 *
 */
//@CommonsLog(topic="CounterLog")
//public class LogExample {
//	public static void main(String[] args) {
//		log.error("somthing else is wrong here");
//	}
//}

@Slf4j
@RestController
public class LogExample{
	
	//private final Logger logger=org.slf4j.LoggerFactory.getLogger(LoggerTest.class);
	
	
//	public static void main(String[] args) {
//		
//		String name="inke";
//		int age=33;
//		log.error("name:"+name+", age:"+age);
//		log.error("name:{},age:{}",name,age);
//		
//	}
//	
	
	@RequestMapping("/test")
	public void test() {
		String name="inke";
		int age=33;
		log.error("name:"+name+", age:"+age);
		log.error("name:{},age:{}",name,age);	
		log.info("dasdfasfaf");
	}
	
}













