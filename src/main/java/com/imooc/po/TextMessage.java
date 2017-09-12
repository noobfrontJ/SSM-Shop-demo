package com.imooc.po;


public class TextMessage {
	public String ToUserName;
	//	开发者微信号
	public String FromUserName;
	//	发送方帐号（一个OpenID）
	public Long CreateTime;
	//	消息创建时间 （整型）
	public String MsgType;
	//	image
	public String Content;
	//	图片链接（由系统生成）
	public String MediaId;
	//	图片消息媒体id，可以调用多媒体文件下载接口拉取数据。
	public String MsgId;
	//	消息id，64位整型
	public String getToUserName() {
		return ToUserName;
	}
	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}
	public String getFromUserName() {
		return FromUserName;
	}
	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}
	public Long getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(Long createTime) {
		CreateTime = createTime;
	}
	public String getMsgType() {
		return MsgType;
	}
	public void setMsgType(String msgType) {
		MsgType = msgType;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public String getMediaId() {
		return MediaId;
	}
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}
	public String getMsgId() {
		return MsgId;
	}
	public void setMsgId(String msgId) {
		MsgId = msgId;
	}
	
}
