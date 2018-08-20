# 账户保管箱 macroLab.myAcct 

## 用途
- 个人生活工作中账号太多了记不住
- 每个账号因安全级别需要，复杂难记
- 业务涉密信息（如：报价，费率...）内容虽然不多，但无处安全记录
- 我的银行卡 密码，开户行地址，网银地址，关联UKey编号,不能随便放吧

太多隐私数据要记录， excel安全么？
于是有了这个自己的离线保存隐私数据的项目。这个隐私资料保密工具，如果是封装好的exe可能没人敢用，只有开源的，清晰看到里面代码实现过程的，才敢放心使用。

## 变更历史
 * 2015.5.1 swing版启用
 * 2018.8.16 javaFX改写

## 实现技术
 用简单技术实现，无框架，精简灵活
 - AES加密敏感信息
 - JavaFX客户端
 - SQLite 本地数据库

## 功能说明
1. 账号内容用AES算法加密
2. 资料保护秘钥加密时加盐处理，每次保存时秘钥都会变更，一次一密
3. 秘钥校验值由MD5多次重复加盐计算，秘钥校验值用于提示你使用的是那个秘钥，系统不存储秘钥。
4. 可直接粘贴word中的内容，支持图片保存（有点像个笔记工具了）
5. 每隔5秒，检测到要内容变化就自动保存
6. 切换库文件

## todo
- 同秘钥保护的资料内容搜索
- 备份库
- 秘钥尝试次数

![image](https://github.com/hzhlu/myAcct/blob/master/doc/mainFrame1.png)