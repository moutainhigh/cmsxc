package cn.com.leadu.cmsxc.pojo.assistant.vo;

import lombok.Data;

/**
 * Created by yuanzhenxia on 2018/4/13.
 *
 * 筛选附近停车场vo
 */
@Data
public class ParkingDistanceVo {
    private String id;// 停车场id
    private String lat;// 纬度
    private String lon;// 经度
    private Double distance;// 距离
    private String address;// 中文地址
    private String openTime;// 营业开始时间(08:30)
    private String closeTime;// 营业结束时间(22:00)
    private String phoneNum;// 联系电话
    private String plateCarFlag;// 板车是否可入 0:不可入、1:可入
    private String truckFlag;// 货车是否可入 0:不可入、1:可入
}
