package com.deepblue.memorydemo.dao;

import com.deepblue.memorydemo.bean.Card;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardDao {

    public List<Card> getAllCard(@Param("cardnumber")String cardnumber,@Param("pageCard")int pageCard,@Param("pageCardSize")int pageCardSize);
    public int getCardCounts(@Param("cardnumber")String cardnumber);
    public int addCard(Card card);
    public int deleteCard(int id);
}
