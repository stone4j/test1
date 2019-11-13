package com.cskaoyan.service;

import com.cskaoyan.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountDao accountDao;
    @Autowired
    TransactionTemplate transactionTemplate;
    @Override
    @Transactional
    public void transfer(int fromId,int destId, int money) {
        int fromMoney = accountDao.selectMoneyById(fromId) - money;
        int destMoney = accountDao.selectMoneyById(destId) + money;
        /*transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus status) {
                accountDao.updateMoneyById(fromId,fromMoney);
                int i = 1/0;
                accountDao.updateMoneyById(destId,destMoney);
            }
        });*/
        accountDao.updateMoneyById(fromId,fromMoney);
        //int i = 1/0;
        accountDao.updateMoneyById(destId,destMoney);

    }
}
