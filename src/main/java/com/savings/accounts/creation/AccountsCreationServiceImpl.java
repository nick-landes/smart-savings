package com.savings.accounts.creation;

import com.savings.accounts.AccountEntity;
import com.savings.accounts.AccountsRepository;
import com.savings.accounts.creation.checkrules.AccountCreationCheckRule;
import com.savings.accounts.structs.AccountDto;
import com.savings.accounts.structs.mapper.AccountMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class AccountsCreationServiceImpl implements AccountsCreationService {

    AccountsRepository accountsRepository;
    AccountMapper accountMapper;
    List<AccountCreationCheckRule> checkRules;

    public void create(AccountDto accountDto) {
        checkRules.forEach(checkRule -> checkRule.check(accountDto));
        AccountEntity account = accountMapper.toAccountEntity(accountDto);
        accountsRepository.save(account);
    }
}
