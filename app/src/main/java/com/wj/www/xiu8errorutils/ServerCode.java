package com.wj.www.xiu8errorutils;

/**
 * 服务器code
 * 
 * @author wangjian
 * 
 * */
public class ServerCode 
{
	public static final int ERRORCODE_BALANCE_NOTENOUGH 		= 552020;//余额不足
	
	public static final int ERRORCODE_TOKEN_ILLEGAL				= 551007;//token非法
	public static final int ERRORCODE_TOKEN_INVALID				= 551008;//token失效
	
	public static final int ERRORCODE_REFRESHTOKEN_ILLEGAL		= 551018;//refreshToken失效,非法、错误
	public static final int ERRORCODE_REFRESHTOKEN_INVALID		= 551019;//refreshToken失效,需重新登录
	public static final int ERRORCODE_REFRESHTOKEN_MISMATCH		= 551020;//refreshToken不匹配
	public static final int ERRORCODE_LOGIN_ONOTHERDEVICE		= 551021;//在其他设备登录
	public static final int ERRORCODE_SEND_GIFT_ERROR		  = 552020;//送礼事的余额不足

	public static final int ERRORCODE_SHOW_CHECK_CODE_1       = 552069;//用户登录失败，且登录次数超过3次
	public static final int ERRORCODE_SHOW_CHECK_CODE_6 	  = 552070;//用户名或密码错误
	public static final int ERRORCODE_SHOW_CHECK_CODE_2       = 552071;//验证码输入错误
	public static final int ERRORCODE_SHOW_CHECK_CODE_3       = 552072;//验证码失效
	public static final int ERRORCODE_SHOW_CHECK_CODE_5       = 552073;//用户名或密码不能为空
	public static final int ERRORCODE_SHOW_CHECK_CODE_4       = 552074;//验证码不能为空

	public static final int ERRORCODE_SHOW_CHECK_CODE_BLACK    = 552011;//被封号
	public static final int ERRORCODE_SHOW_CHECK_CODE_IP_NOT_ALLOW    = 551002;//ip 非法
	public static final int ERRORCODE_ORIGAMI_NOT_ENOUGH       = 552075;//用户千纸鹤余额不足
	public static final int ERRORCODE_HOST_NOT_IN_ROOM         = 552081;//主播未开播，不能赠送千纸鹤
	
	public static final int ERRORCODE_AUTHERROR_KITOUT 		   = 552097;//被踢用户进入房间错误提示
	public static final int ERROR_START_LIVE_IN_OTHER          = 552043; //用户在其他客户端开播
	public static final int ERROR_REPORT_WHEN_STOP             = 552041; //汇报时候发现已经停播
	
	public static final int ERROR_ALREADY_REGISTERED           = 552165;//已经注册。ready registered
	public static final int ERROR_CODE_CHECK_MAX_NUM           = 552164;//验证获取次数操作限制．

	public static final int ERROR_CODE_XIUZUAN_NOTENOUGH		= 552020;//秀钻余额不足
	public static final int ERROR_DOWN_BET_MAXSIZE = 552220; //游戏次数达到上限。
	public static final int ERRORCODE_DOWN_BET_MONEY_MAX = 552221; //游戏下注金额达到上限。
	public static final int ERRORCODE_RE_SIGN_IN = 552187; //用户重复签到
	public static final int ERRORCODE_NOBLE_6_CHAT_LIMIT = 552254; //贵族六级用户被踢返回的ErrorCode 禁言.
	public static final int ERRORCODE_NOBLE_6_KIKOUT    = 552255; //贵族六级用户被踢返回的ErrorCode 踢人.
	public static final int ERRORCODE_CANLIVE_GOTO_WEB = 552267;//开播鉴权返回此错误码时，需要跳转到落地页，地址从errorMsg中获得
	public static final int ERRORCODE_REAL_NAME = 552295;//没有实名认证
	public static final int ERRORCODE_NOT_REDBAG = 552297; //红包已经被领走了．

	public static final int ERROR_CODE_FAMILY_APPLY_REFRESH_1 = 552015;//家族-需要刷新申请列表
	public static final int ERROR_CODE_FAMILY_APPLY_REFRESH_2 = 552296;//家族-需要刷新申请列表

	public static final int ERROR_CODE_NOT_TO_HIGH_FISH = 552299;//不能切换到捕鱼高级场
	public static final int ERROR_CODE_SOCKET_PWD_ERROR = 551100;//连接socket时密码错误
	public static final int ERROR_CODE_CANCEL_ATTENTIONED  = 552034;//已经取消关注.
	public static final int ERROR_CODE_ATTENTIONED  = 552033;//已经关注过.

	public static final int ERROR_CODE_RED_BAG_GETED = 552296;// 已经领取过红包．　.
    public static final int ERROR_CODE_AUDIO_CONFIRM_NEED_INPUT_PASSWORD = 552304;//进入房间需要输入密码
	public static final int ERROR_CODE_AUDIO_AUTH_NEED_INPUT_PASSWORD = 552303;//进入房间需要输入密码

	public static final int ERROR_CODE_ALREADY_DOWN_MIC = 552305;//汇报时 已下麦
}
