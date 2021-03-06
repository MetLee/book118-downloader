package me.rainking;

import cn.hutool.core.collection.CollUtil;

import java.util.List;

/**
 * @author : Rain
 * @date : 2018/9/6 22:26
 * @description :
 */

class Constants {

    static final String IMG_PREFIX_URL = "/img/?img=";

    static final String NEXT_PAGE_PATH_1 = "/pdf/GetNextPage/";

    static final String NEXT_PAGE_PATH_2 = "/PW/GetPage/";

    static final String OPEN_FULL_URL = "https://max.book118.com/index.php?g=Home&m=View&a=viewUrl&flag=1&cid=";

    static final String PREVIEW_URL = "https://max.book118.com/index.php?g=Home&m=NewView&a=index&aid=";

    static final String PIC_LINK_URL = "https://openapi.book118.com/getPreview.html?project_id={}&aid={}&view_token={}&aid_encode={}&page=";

    static final String FILE_NOT_EXIST = "文件不存在";

    static final List<String> TAG_OF_END = CollUtil.newArrayList("!", "Over", "Error", "Response", "ReadLimit");

    /**
     * 匹配页面中隐藏的input的值，用于获取文档信息
     */
    static final String INPUT_PATTERN = "<input type=\"hidden\" id=\"(.*?)\" value=\"(.*?)\".*?/>";
    /**
     * 用于获取input标签中的id
     */
    static final String ID_PATTERN = ".*id=\"(.*?)\"";
    /**
     * 用于获取input标签中的value
     */
    static final String VALUE_PATTERN = ".*value=\"(.*?)\"";

    /**
     * 获取302跳转页面中的跳转href
     */
    static final String HREF_PATTERN = ".*href=\"(.*?)\"";


    static final int MAX_BIT_OF_PAGE = 5;



}
