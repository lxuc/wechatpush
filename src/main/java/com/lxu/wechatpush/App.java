package com.lxu.wechatpush;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WeChatMsgSend swx = new WeChatMsgSend();
        try {
            String token = swx.getToken("XXXX","XXXXX");
            String postdata = swx.createpostdata("XuLei", "text", 1000002, "content","test message from java lient");
            String resp = swx.post("utf-8", WeChatMsgSend.CONTENT_TYPE,(new WechatUrlData()).getSendMessage_Url(), postdata, token);
            System.out.println("获取到的token======>" + token);
            System.out.println("请求数据======>" + postdata);
             System.out.println("发送微信的响应数据======>" + resp);
        }catch (Exception e) {
            e.getStackTrace();
        }
    }
}
