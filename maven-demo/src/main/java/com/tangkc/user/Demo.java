package com.tangkc.user;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.json.JSONUtil;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author tangkc
 * @description
 * @date 2020/10/28 17:06
 */
public class Demo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String cookie = "CURRENT_SYSTEM=266946423468851203; language=undefined; sid=771051716526211073; rememberMe=XqrPNjICuHztJjSesfJjWZn8w1JLWiR9xgxed55zQoxuVPx2cupzP8+ajL1IDXG9N8rnDK+FUJ0U/VN7LFRp7NID6cVB09qr7O0x3UEsOzS2xQvBKeQiL8lwpv79TMGUH9w+snlHb42+12csHwkj5org8j84HyM56LZQ8KDOzQkFObZ+43GlHzW6pXSCfJjGa48jYGycaDLuyFleBAl7XQCyYdc73Qh+fxyYzXT2tFwAxFMC8F48Yi1ATYuTT0k35gjhu0kRoP5asCyaiUyExtm9EZt0AKmEV/y2QuRHP5uM6Np5FIMc1uHua8UZa1nArKX8TIkRUdtgVemHBXhFV0nhz2UHUzqNDruaOtxQ9y+l1svVjpiENWVlZpVrOhhUe93Z/nQaud7KbYu4quZhL+X3VxhZH3l/8PyXftHZ/iZ1Uh+o7CU2Vaz6LqypMSEJmtviYU+OeQFQJMbr7gvLuqX3sJR9AVAp/EhA000vtWM=; intro_form_cookie_index=1; intro_bpmn_cookie_index=1";
        String userCodesStr = "wanglin,qizhenwei,zhangcaixia,wangyuexia,zuoyawen,liuyanhua,liuxi,yangle,yaosong,huangdaozuo,zhuanghongxiang,gaozuo,shenxiang,zhangyu,zhangcong,wutianran,liuyi,liuhaibo,sunbing,wangliang,tianzhiji,zhuyapeng,lijun,yangkun,peiguo,yuanhua,chenjianjun,yangao,daijie,chenchao,chenxiaofei,jinjian,linguangchun,liuqiang,wenbin,wujunsong,zhaowang,wangjiarui,liyehe,peiyang,liuruizuo,dongjian,xieyang,linqiang,chenggang,gaoxuewu,matongjin,chenxiaozhou,chenhongbing,qinxiaohong,yuanni,zhouqing,jiyawang,yuanzuo,chenxueshu,zhouhuiping,shizhenghai";
        String userNamesStr = "王林,齐振伟,张彩霞,王月霞,缪雅文,刘燕华,刘希溦,杨乐,姚松,黄道眙,庄红祥,高嵩,沈祥,张宇,张聪,吴天然,刘毅,刘海波,孙兵,王亮,田志吉,朱亚鹏,李军,杨昆,裴国,袁华,陈建军,杨傲,戴杰,陈超,陈孝飞,金剑,林广春,刘强,闻斌,吴俊松,赵旺,王家瑞,李业和,裴阳,刘瑞琦,董箭,谢阳,林强,程刚,高学武,马同金,陈孝州,陈洪兵,秦晓虹,原妮,周卿,纪亚旺,袁婷,陈学书,周慧平,石正海";

        String[] userCodes = userCodesStr.split(",");
        String[] userNames = userNamesStr.split(",");

        for (int i = 0; i < userCodes.length; i++) {
            String userCode = userCodes[i];
            String userName = userNames[i];

            Map<String,Object> param = new HashMap<String,Object>();
            param.put("account",userCode);
            param.put("password","123456");
            param.put("name",userName);
            param.put("status","actived");
            param.put("email","1016771049@qq.com");
            param.put("attrId","680088269395853312");
            param.put("isSuper","N");
            param.put("gender","male");
            param.put("posItemList",new ArrayList<String>());
            param.put("roleItemList",new ArrayList<String>());
            param.put("userGroupItemList",new ArrayList<String>());
            param.put("attrItemList",new ArrayList<String>());

            String url = "http://192.168.0.120:8081/hbp/platform/org/partyEmployee/save.htm";
            String jsonStr = JSONUtil.toJsonStr(param);
            String encode = URLEncoder.encode(jsonStr);
            url = url + "?json="+encode;

            HttpResponse execute = HttpRequest.post(url).cookie(cookie).execute();
            String body = execute.body();
            System.out.println(String.format("userName===>%s===>%s",userName,body));
        }
    }
}
