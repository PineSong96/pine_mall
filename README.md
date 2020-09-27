#Pine微服务商城
本项目从0到1再到一个成熟体系的开源项目，提供一系列的电商体系遇到的问题解决方案
> 由于项目模块完全由一人开发,开发周期会很长
>此项目是我一边学习，一边实践开发会将各种技术应用到业务场景之中，从而提高自己的技术水平
>因为还要工作和学习，希望能有小伙伴能一起共同开发

## 目前包含的模块
| 服务名称  |  功能   |
| --------   | -----:  |
| pine-auth| 服务认证中心服务   |
| pine-gateway  |    服务网关服务   |
| mall-member  |    商城会员服务    |
| mall-member  |    商城会员服务    |
| pine-generator  |      逆向工程    |
|  pine-common  |      基础工具    |
|  mall-admin  |  后台管理|
|  mall-product  |  商品服务|

## 实现的功能模块（持续更新）
- [ ] 秒杀系统
- [ ] 高并发订单业务处理
- [ ] 分库分表，分布式事务
- [ ] 自动化监控
- [ ] ELK日志系统
- [ ] 线上调优
- [ ] 国际化

## 开发的业务模块（持续更新）
- [ ] 商品服务
- [ ] 后台管理
# 我的公众号
![公众号](https://mmbiz.qpic.cn/mmbiz_jpg/LdDDm7ozIoYKX3Hyydw0U1KgFeYNkLTcGnrWySAXHNGYJV4uvxtI8N5m7o7TJq3CI7gL0Bib0lNiaKNU4Dia6s7RA/640?wx_fmt=jpeg "公众号")
Pine的知识库  微信号 : 771190883

##随心笔记（后期单独整理）
1.基于oauth2.0 实现微信授权登录,短信验证码登录等思路
在进入UserDetailsService.loadUserByUsername() 方法之前拦截短信 授权等信息 解析出用户名进行登录
2.同一个认证中心 认证不同的登录体系 例如 用户登录  管理员登录  ，暂时想法通过用户名来区别  用SPI来实现