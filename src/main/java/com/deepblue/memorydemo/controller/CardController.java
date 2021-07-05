package com.deepblue.memorydemo.controller;

import com.alibaba.fastjson.JSON;
import com.deepblue.memorydemo.bean.Card;
import com.deepblue.memorydemo.bean.QueryInfo;
import com.deepblue.memorydemo.dao.CardDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class CardController {

    @Autowired
    private CardDao cdao;

    @RequestMapping("allcard")
    public String getCardList(QueryInfo queryInfo) {
//        获取最大列表数和当前编号
        int cardCounts = cdao.getCardCounts("%" + queryInfo.getQuery() + "%");
        int pageStart = (queryInfo.getPageNum() - 1) * queryInfo.getPageSize();

        List<Card> cards = cdao.getAllCard("%" + queryInfo.getQuery() + "%",pageStart, queryInfo.getPageSize());
        HashMap<String,Object> cardres = new HashMap<>();
        cardres.put("cardCounts",cardCounts);
        cardres.put("data",cards);
        String cardres_string = JSON.toJSONString(cardres);
        return cardres_string;
    }

    @RequestMapping("/addcard")
    public String addCard(@RequestBody Card card){
        int i = cdao.addCard(card);
        return i > 0? "success":"error";
    }

    @RequestMapping("/deletecard")
    public String deleteCard(int id){
        int i = cdao.deleteCard(id);
        return i >0?"success":"error";
    }
}
