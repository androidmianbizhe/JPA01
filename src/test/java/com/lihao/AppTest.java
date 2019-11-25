package com.lihao;

import static org.junit.Assert.assertTrue;

import com.lihao.dao.MoneyRepository;
import com.lihao.pojo.MoneyPO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.sql.Date;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
//@Transactional
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Autowired
    MoneyRepository moneyRepository;

    @Test
    public void testJpaQuery() {
        MoneyPO moneyPO = moneyRepository.getOne(1);
        System.out.println(moneyPO.toString());
    }

    @Test
    public void testJpaInsert() {

        MoneyPO money = new MoneyPO();
//        money.setId(122);
        money.setMoney(122231L);
        money.setName("asda");
        money.setCreateAt(new Date(System.currentTimeMillis()));
        money.setIsDelected(new Byte((byte)1));
        money.setUpdateAt(new Date(System.currentTimeMillis()+100000));

        MoneyPO moneyPO = moneyRepository.save(money);
    }

    @Test
    public void testJpaUpdate() {
        MoneyPO money = new MoneyPO();
        money.setId(1);
        money.setMoney(122231L);
        money.setName("asda");
        money.setCreateAt(new Date(System.currentTimeMillis()));
        money.setIsDelected(new Byte((byte)1));
        money.setUpdateAt(new Date(System.currentTimeMillis()+100000));
        MoneyPO moneyPO = moneyRepository.save(money);

    }

    @Test
    public void testJpaDelete() {
        MoneyPO money = new MoneyPO();
        money.setId(11);

        moneyRepository.delete(money);

    }
}
