package com.zking.ssm.book.util;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {

	//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016101700704899";

	// 商户私钥，您的PKCS8格式RSA2私钥
	public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCjMrgv+LefCq2QtAhLcHQ5tjcDW0SUqj5bcOCQHxUII4wz6OHT6yA1RT3nsilAa6qS69YvVX4e+0ZYoIlu0G7qg1G64/jtjm+M7+TNrwaVmv+cwFt/m4DOOpDO4E4rqYQ6PQXui8BJcLwrru3EUfA0oOwpU3d9uoHryuJ48rFXIEV9Q2MOf86FXkcFW3xuRwLVQKoJ9BG7F/Awhng/TsWIBBpPWi8Li77GbtdnRhswCajh6DCXsm/cUgHcP317D6oFw6ua4hJLy9hnGHU5VSIeOX6qCYTwZwZZRpQdvcGtNmVWnpLp8V+o1W24caWZZteC94ussSurUSYVRfL9PuMfAgMBAAECggEAZ8cZ/09vHNDCfHEvkSFql0R7CURhgRQdYTKParaJPkq0nlHqQUOUkKt+aTcPKmsM5i7YXfNEp1jsa/FyU6hxz+k/8NOFeTMJVps6aV1yl3IgN8LOrH/rUblGWnei3fsHHa2udvohhdINps2vXxcn45+tbb4pDyep9JJon7bc9OSJcx1bxhwB8DVxMiaZvHmdt95ItbmNjhxxF7y6LrpCeveearhck05IVwAtTIZlFPFbzEboGrAi8OLN6wcvGos0jEf9Lr1VnReJK9oUpUC9S9/VvVyb2ynJ4J+njgcrw1+PJfOesHo1d3TL/WHxVmpa0WWgbqMQmuGR3bPdMVGYyQKBgQDVz8HSlsgbiDeilXRXzxSXAdsgw/MfMHxB4Kbyl/mZZxq8oWlSmgSx2Hxz+bCImCMW5pQfrs8uj9mX18QGP/3SMcb50cfHhAo98l4uR7XOCNcCt7UlGZSkCJ1UMIBtwFJjKWpsnWs1EUgxBJTOy0oqfR4Tci4aRALshemhD4QkCwKBgQDDZlS8LT5z7pcaCW4xTNH6fqtbiMlKzYcKOaZSMvFhvDGwReiC4kdrclIEaEjxqCVFZu1Os8znX+ISLUnAYWrIoLwR1enRPJ8fUl0KAWgs3tYJyDAjBvC5ErOt1ctWc+zbZnfSEZKRqFBPdJL3w9lt9N/Q8NtrAJjsKM8H4e41vQKBgAOp6rVUFhu6qtFjZDn4925a/slB8lGPgCGU2ud/SSyiwqeG0Io0z23IuuE13xuIF9nVm6YrVauDlYPvk5FT2WKXrcQsHxNBJPfIxmpemjPsnNqUEUuQc6aX6zI9HoZC7GZ8mDFCRUsEf8svO+mLPDscJ77HjxiuH6qz5Lv4yxffAoGAaSh7VcJrp+yxeRu2J+YV41+kTOCypAU0NbaM4hP0gArOGvWkijvI//RIW4LcLuG1HUKlWAO/tI2PlwS0ekpzM4H9dQPQkAC2Ch9DXw0eyXcrbZxE+7TSfGeqN1Wl1uMQh4r/1RgL70PL5Nbx+VF3hIuSoFnfXBi4M/BKaw2WK2kCgYAcBV7oPmsYjGBu5ti/kFNYwNVi3w/hNf/MTwT/bV0r24DZkqhx3QrR8ALONmq2axGTI2HL8iNTfvWnX6PrAt0wtUJoLML7pddZJJQbw5WIBGbegriIFW91gtNt0hs3BroUdPzOdujLcEQaK04eie99etzVIkBK5TR4Jq2dECG+DA==";

	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
	public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuIT/nN5puBx5Jva9w9+YHRTzlvGAF6hrTq8oiIDBXKG/f2c2sPJvowUigPmNc+01rvc/A+LW3W/ZH2eHsisBSDnjgOgcbqSchw+PPAq/PFJO1QOelhTlGliTIXlAG46wNtwsqnoiPYn/ye0/52DcpeKAO/A0rBfGvqpWZ8UHq6+AWlEbWFPE37zwkHVQu9BKGq8HE2VTuVK7r0aVq8r14Mt61F9KpJ0XAkd89zKZjFBEKP2cexX93n19jd01le5wLVCNbTs/mKi3EWsLs3/jLOFe0RejcXH3s+MEXgyYqmyemyYaNgeth4orAp8do7zTTeunyAkwbWdvorhxqnHMkQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://zking.fun/notify.do";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问

	public static String return_url = "http://localhost:8080/ssm/book/successBuy";
	//public static String return_url = "http://localhost:8080/web_14/notify.do";
	// 签名方式
	public static String sign_type = "RSA2";

	// 字符编码格式
	public static String charset = "utf-8";

	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

	// 支付宝网关
	public static String log_path = "C:\\";


	//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

	/**
	 * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
	 * @param sWord 要写入日志里的文本内容
	 */
	public static void logResult(String sWord) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
			writer.write(sWord);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}




}
