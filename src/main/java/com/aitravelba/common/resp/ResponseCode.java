package com.aitravelba.common.resp;
/**
 * Created by m000665 on 2016/10/27.
 * 错误码统一以模块号开头
 * RPC 模块编号
 *  account       1
 *  common        2
 *  first         3
 *  outsource     4
 *  repay         5
 *  task          6
 *  order         7
 *  third         8
 * CGI 编号
 *  admin         20
 *  outsource     21
 *  first         22
 *  app           23
 */


public enum ResponseCode {




    SUCCESS_DEFAULT(0),
    SUCCESS(0,""),
    FAIL(-1,"操作失败"),
    PAGE_QUERY_INVALID(-2,"分页参数为空或数据格式不正确"),
    SERVER_ERROR(500,"服务器错误"),



    SQL_DATA_UPDATE_ERROR(9,"数据更新失败"),

    PARAM_INVALID(2,"参数错误"),
    ILLEGAL_REQUEST(3,"异常请求"),
    OPERATION_FORBIDDEN(4,"统繁忙，请稍后重试"),
    SESSION_KEY_EXPIRE(5,"会话已过期，请重新登陆"),
    INTERNAL_SERVER_ERROR(500,"系统繁忙，请稍后重试"),
    ILLEGAL_JSON_ERROR(400,"非法JSON数据格式"),
    ILLEGAL_JSON_FORMAT_ERROR(401,"数据类型格式不正确"),
    ILLEGAL_REQUEST_BODY_ERROR(402,"请求数据为空或数据格式不正确"),
    PUSH_ERROR(7001,"push失败"),
    EXCEL_SHEET_NOT_EXIST(5,"sheet也不存在"),
    IDEMPOTENT_ERROR(10,"请误重复操作"),

    /***
     * account 100001开始
     **/
    ACCOUNT_EXIST(100001,"账号已存在"),
    ACCOUNT_NOT_EXIST(100002,"账号不存在"),
    SESSION_INVALID(100003,"会话失效，请重新登录"),
    SMS_CODE_ERROR(100004,"短信验证码错误"),
    SMS_FREQUENT(100005,"操作太频繁，请稍后再试"),
    ADMIN_NOT_EXIST(100006,"管理员不存在"),
    CHECK_ADMIN_FAIL(100007,"管理员校验失败"),
    RESEND_LOGIN_SMS_KEY_INVALID(100008,"重发短信令牌无效"),
    RESEND_LOGIN_SMS_KEY_ERROR(100009,"重发短信令牌不匹配"),
    ACCOUNT_ALREADY_FROZEN(100010,"账号已冻结"),
    SMS_FREQUENT_ONE_DAY(100011,"当天下发短信达到最大值"),
    SMS_CODE_OVERDUE(100012,"短信验证码过期"),
    PWD_ERROR(100013,"密码错误"),
    MOBILE_ALREADY_REGISTER(100014,"手机号已注册"),
    IDCARD_ALREADY_REGISTER(100015,"身份证已注册"),

    /**
     * repay 300001开始
     */
    REPAY_REPEAT_CONFIRM(300001,"请勿重复确认"),

    /**
     * 第三方模块从800001开始
     */
    OPERATION_FAIL(800001,"操作失败"), //操作失败
    IMAGE_VERIFY_ERROR(800002,"验证码错误"),
    QINIU_KEY_NOT_EXIST(800003,"七牛key异常"),//
    GETUI_ID_NOT_EXIST(800004,"个推id不存在"),


    /**
     * taskorder 模块从700001开始
     */
    TASK_ORDER_NOT_EXIST(700000,"订单不存在"),
    TASK_ORDER_TASK_NOT_EXIST(700001,"任务不存在"),
    TASK_ORDER_ORDER_NO_IS_EMPTY(700002,"订单号不能为空"),
    TASK_ORDER_TASK_IS_EMPTY(700003,"结果为空"),
    TASK_ORDER_DEPARTMENT_NOT_FOUND(700004,"部门信息不正确"),
    TASK_ORDER_TASK_BATCH_NO_ERROR(700005,"资产包批次号不正确"),
    TASK_ORDER_USER_INFO_ERROR(700006,"用户信息不正确"),
    TASK_ORDER_RECORD_NOT_EXIST(700007,"催收记录不存在"),
    TASK_ORDER_REPAY_EVIDENCE_NOT_EXIST(700008,"还款凭证不存在"),
    TASK_ORDER_DEPARTMENT_TASK_NOT_MATCH(700009,"部门和任务不匹配"),
    TASK_ORDER_STATUS_EXCEPTION(700010,"查不到对应的订单或订单状态异常"),
    TASK_ORDER_GROUP_NOT_FOUND(700011,"小组信息不正确"),
    TASK_ORDER_REPAY_EVIDENCE_EMPTY_LIST(700012,"催回记录为空,请检查数据格式是否正确"),
    TASK_ORDER_RECORDS_NOT_FOUND(700013,"找不到该批次导入的催收记录"),

    TASK_ORDER_TASK_EXIST(7000014,"该任务已派单"),
    TASK_ORDER_GROUP_QUERY_ERROR(7000015,"查询小组信息异常,请检查小组id是否正确"),
    TASK_ORDER_REPAY_EVIDENCE_CONFIRM_ERROR(7000016,"还款凭证已确认,不能再修改"),
    TASK_ORDER_REPAY_EVIDENCE_STATUS_ERROR(7000017,"还款凭证不是确认中状态不能操作"),
    TASK_ORDER_TASK_ID_NOT_UNIQUE(7000018,"taskId 不唯一，请检查数据"),
    TASK_ORDER_TASK_NOT_MATCH(7000019,"订单和任务不匹配，请检查数据"),
    TASK_ORDER_REPAY_UPDATE_ORDER_STATUS_ERROR(7000020,"更新订单还款信息失败"),
    TASK_ORDER_REPAY_UPDATE_REPAY_EVIDENCE_STATUS_ERROR(7000021,"更新还款凭证信息失败"),
    TASK_ORDER_REPAY_UPDATE_TASK_STATUS_ERROR(7000022,"更新任务信息失败"),
    TASK_HAS_ONEMORE_RUNNING_ORDER(700023,"一个任务存在多个未结束订单"),
    TASK_ORDER_REPAY_MONEY_ERROR(7000024,"订单还款金额不正确"),
    TASK_ORDER_FIRST_PARTY_INFO_ERROR(7000025,"订单对应甲方不存在"),
    TASK_ORDER_STAFF_INFO_ERROR(7000026,"订单对应催收员不存在"),
    TASK_ORDER_INSERT_ERROR(7000027,"插入订单失败"),
    TASK_ORDER_ALREADY_FINISH_ERROR(7000028,"订单已结束"),
    TASK_ORDER_REPAY_EVIDENCE_EMPTY(7000029,"催回凭证为空"),
    TASK_ORDER_ADD_RECORD_STATUS_ERROR(7000030,"订单状态不是未开案或催收中,不能导入催记"),
    TASK_ORDER_ADD_REPAY_EVIDENCE_STATUS_ERROR(7000031,"订单状态不是催收中,不能导入催回"),
    TASK_ORDER_IMPORT_RECORD_EMPTY(7000032,"催收记录为空,请检查数据格式是否正确"),
    TASK_ORDER_TASK_PACKAGE_ERROR(7000033,"委托给外包公司任务包数据不匹配"),
    TASK_ORDER_APPLY_RETREAT_ERROR(7000034,"至少有一次催收记录,才能申请退单"),
    INSERT_RECORD_ONE_DAY_MAX_LIMIT(7000035,"您所在的小组今天填写催记的次数超过2次了，请明天再试"),

    /**
     * app-server 模块从900001开始
     */
    APP_SERVER_USER_INFO_NOT_EXIST(900001,"用户信息不存在"),


    /**
     * outsource 模块从500001开始
     */
    OUTSOURCE_GROUP_NOT_EXIST(500001,"小组不存在"),
    COMPANY_NOT_EXIST(500002,"公司信息不存在"),
    OUTSOURCE_STAFF_NOT_EXIST(500003,"员工信息不存在"),
    GROUP_STAFF_NOT_EXIST(500004,"小组下催收员不存在"),
    GROUP_EXIST(500005,"该小组已经存在"),
    GROUP_STAFF_NOTNULL(500006,"不能删除包含催收员的小组 "),

    /**
     * task 模块从600001开始
     */
    TASK_EXIST_ERROR(600001,"任务存在异常"),
    TASK_UPDATE_STATUS_FAIL(600002,"任务状态更新异常"),
    TASK_CREATE_CONTACTOR_FAIL(600003,"新增联系人失败"),
    TASK_ENTRUST_TIME_ERROR(600004,"任务委托时间格式错误"),
    OUTSOURCE_TASK_CREATE_ERROR(600005,"委托任务失败"),
    UPDATE_TASK_ERRPR(600006,"任务更新失败"),
    UPDATE_OUTSOURCETASK_FAILED(600007,"更新外包任务失败"),
    CHOOSE_PARAM_ERROR(600008,"任务筛选参数错误"),
    EXPIRED_TASK_FAILED(600009,"过期任务修改失败"),
    TASK_NOT_EXIST( 6000010,"任务不存在"),
    OUTSOURCE_TASK_NOTEXIST_ERROR(6000011,"委托任务不存在");



    final private int code;
    final private String msg;

    ResponseCode(int code){
        this.code = code;
        this.msg="";
    }

    ResponseCode(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
