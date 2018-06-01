package com.merchant;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.mcipay.persistence.mapper")
public class MerchantConfiguration {
}
