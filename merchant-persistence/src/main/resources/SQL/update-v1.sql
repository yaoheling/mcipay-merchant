CREATE TABLE `merchant_transaction` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `merchant_id` int(11) NOT NULL COMMENT '商户ID，用于记录商户来源',
  `merchant_serial_no` varchar(64) NOT NULL COMMENT '与商户交易的流水号',
  `merchant_order_no` varchar(64) DEFAULT NULL COMMENT '商户订单号，便于商户进行查询',
  `merchant_create_time` datetime DEFAULT NULL COMMENT '商户订单创建时间',
  `management_trans_time` datetime DEFAULT NULL COMMENT '商户发起该交易时间，以管理系统时间为准',
  `merchant_currency` varchar(255) DEFAULT NULL COMMENT '币种',
  `merchant_card_type` varchar(64) DEFAULT NULL COMMENT '卡种',
  `merchant_foreign_amount` decimal(10,4) DEFAULT NULL COMMENT '商户交易外币金额',
  `merchant_cny_amount` decimal(10,4) DEFAULT NULL COMMENT '商户交易人民币金额，商户待扣款金额',
  `user_email` varchar(128) DEFAULT NULL COMMENT '客户邮箱',
  `user_trans_url` varchar(128) DEFAULT NULL COMMENT '客户交易网址',
  `payment_trans_status` int(8) DEFAULT NULL COMMENT '三方支付交易状态 三方交易状态 -2：支付未发起（默认）；-1：失败；0：处理中；1：成功；',
  `payment_service_status` int(8) DEFAULT NULL COMMENT '0：正常状态；1：拒付；2：退款',
  `settlement_status` int(11) DEFAULT NULL COMMENT '结算状态  0：未结算（默认）；-1：结算审核中；1：已结算；2：驳回',
  `waybill_status` int(11) DEFAULT NULL COMMENT '运单状态  -1：待审核；0：运单未提交（默认）；1：通过；2：驳回',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商户交易表';


CREATE TABLE `merchant_waybill` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `merchant_transaction_id` int(11) NOT NULL COMMENT '商户交易表主键',
  `waybill_no` varchar(64) DEFAULT NULL COMMENT '运单号',
  `waybill_status` int(11) DEFAULT NULL COMMENT '运单状态  -1：待审核；1：通过；2：驳回',
  `merchant_commit_time` datetime DEFAULT NULL COMMENT '运单提交时间',
  `management_auditor` varchar(64) DEFAULT NULL COMMENT '审核人',
  `management_audit_time` datetime DEFAULT NULL COMMENT '审核时间',
  `receiver` varchar(64) DEFAULT NULL COMMENT '收件人',
  `country` varchar(64) DEFAULT NULL COMMENT '国家',
  `region` varchar(64) DEFAULT NULL COMMENT '地区',
  `city` varchar(64) DEFAULT NULL COMMENT '城市',
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  `postcode` varchar(64) DEFAULT NULL COMMENT '邮政编码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商户运单信息及审核';


CREATE TABLE `management_refuse` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `merchant_transaction_id` int(11) NOT NULL COMMENT '商户交易表主键',
  `trans_status` int(11) DEFAULT NULL COMMENT '-2：拒付；1：成功（状态回滚）',
  `refuse_operator` varchar(64) DEFAULT NULL COMMENT '拒付操作人',
  `refuse_time` datetime DEFAULT NULL COMMENT '操作时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='拒付流水表，操作流水信息记入该表，实际状态可查看merchant_transaction表';


CREATE TABLE `merchant_settlement` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `merchant_transaction_id` int(11) NOT NULL COMMENT '商户交易表主键',
  `settlement_status` int(11) DEFAULT NULL COMMENT '结算状态  -1：结算审核中；1：已结算；2：驳回',
  `settlement_apply_operator` varchar(64) DEFAULT NULL COMMENT '结算申请人',
  `settlement_apply_time` datetime DEFAULT NULL COMMENT '结算时间',
  `management_auditor` varchar(64) DEFAULT NULL COMMENT '审核人',
  `management_audit_result` tinyint(4) DEFAULT NULL COMMENT '审核结果 0：不通过；1：通过',
  `management_audit_time` datetime DEFAULT NULL COMMENT '审核时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商户结算表';


CREATE TABLE `payment_journal` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `merchant_transaction_id` int(11) NOT NULL COMMENT '商户交易表主键',
  `user_card_number` varchar(64) DEFAULT NULL COMMENT '用户卡号',
  `management_trans_amount` decimal(10,4) DEFAULT NULL COMMENT '管理系统交易金额，该金额为传递给三方的扣款金额，包括利率差',
  `trans_status` int(8) DEFAULT NULL COMMENT '三方交易状态 0：处理中；1：成功；-1：失败；-2：拒付',
  `trans_query_count` int(11) DEFAULT NULL COMMENT '三方交易状态查询次数',
  `trans_modify_time` datetime DEFAULT NULL COMMENT '三方交易状态修改时间',
  PRIMARY KEY (`id`),
  KEY `transaction_id_index` (`merchant_transaction_id`)
) ENGINE=InnoDB AUTO_INCREMENT=205 DEFAULT CHARSET=utf8 COMMENT='交易流水表，实际发送到三方的请求';

--  2018-05-31 start
CREATE TABLE `merchant_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `full_name` varchar(128) DEFAULT NULL COMMENT '商户全称',
  `short_name` varchar(64) DEFAULT NULL COMMENT '商户简称',
  `business_scop` varchar(64) DEFAULT NULL COMMENT '经营范围',
  `city` varchar(64) DEFAULT NULL COMMENT '所在城市',
  `address` varchar(128) DEFAULT NULL COMMENT '地址',
  `email` varchar(128) DEFAULT NULL COMMENT '邮箱',
  `phone_number` varchar(64) DEFAULT NULL COMMENT '电话',
  `mobile_number` varchar(64) DEFAULT NULL COMMENT '手机号',
  `service_hotline` varchar(64) DEFAULT NULL COMMENT '客服热线',
  `qq` varchar(64) DEFAULT NULL COMMENT 'QQ号',
  `operator_id` varchar(64) DEFAULT NULL COMMENT '录入人ID',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='商户信息表';

CREATE TABLE `merchant_bank_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `merchant_id` int(11) DEFAULT NULL COMMENT '商户信息表主键',
  `name` varchar(64) DEFAULT NULL COMMENT '银行卡姓名',
  `id_card_no` varchar(64) DEFAULT NULL COMMENT '身份证号',
  `mobile_no` varchar(32) DEFAULT NULL COMMENT '手机号',
  `bank_card_no` varchar(32) DEFAULT NULL COMMENT '银行卡号',
  `bank_code` varchar(32) DEFAULT NULL COMMENT '开户行',
  `bank_branch` varchar(64) DEFAULT NULL COMMENT '开户分行',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='商户银行信息表';

--  2018-05-31 end

-- 2018-06-12 START **************************************************************************
CREATE TABLE `merchant_account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `merchant_transaction_id` int(11) NOT NULL COMMENT '商户交易表主键',
  `merchant_currency` varchar(255) DEFAULT NULL COMMENT '币种',
  `request_amount` decimal(10,4) DEFAULT NULL COMMENT '商户请求代扣金额(人民币)=商户缴纳服务费+商户保证金+商户结算金额',
  `merchant_service_amount` decimal(10,4) DEFAULT NULL COMMENT '商户缴纳服务费',
  `merchant_deposit_amount` decimal(10,4) DEFAULT NULL COMMENT '商户保证金',
  `merchant_settle_amount` decimal(10,4) DEFAULT NULL COMMENT '商户结算金额',
  `management_spreads_amount` decimal(10,4) DEFAULT NULL COMMENT '管理平台利率差',
  `actual_amount` decimal(10,4) DEFAULT NULL COMMENT '实际扣款金额商户请求代扣金额+管理平台利率差',
  PRIMARY KEY (`id`),
  KEY `transaction_id_index` (`merchant_transaction_id`)
) ENGINE=InnoDB AUTO_INCREMENT=205 DEFAULT CHARSET=utf8 COMMENT='商户账目表';
-- 2018-06-12 END   **************************************************************************