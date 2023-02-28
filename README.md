# Cartoons

## 概述
本动漫导航网站是基于Java的动漫资讯平台，包括最新热门动漫以及播放网站。

## 系统总体设计

### E-R图（图一）

![图片](https://user-images.githubusercontent.com/59997978/221734709-adf5395d-6846-480a-a67c-573cd4c404be.png)


### 1 登陆
通过登录.html完成登录，跳转到到login-ing.jsp，利用LoginDao.java连接数据库进行数据匹配。

![图片](https://user-images.githubusercontent.com/59997978/221734762-227dac9d-780a-4449-b2a5-3a711015769f.png)


### 2 注册
在登录页面也可以跳转注册页面register.html，再跳转Register.jsp利用Register,java连接数据库完成用户名注册。

![图片](https://user-images.githubusercontent.com/59997978/221734872-b55e0c5f-0829-4a27-870e-e0e283f02093.png)

### 3 首页
在登录后进入首页home.html，这里可以跳转Movies.html和news.html,也可以跳转外网站。首页导航栏连接了jQuery轻量级响应式图片轮播插件ResponsiveSlides.js，可以实现三张图片轮播。

### 4 其余界面
分类板块，对各个分类设置flexisel.js轮播。flexisel.js响应适应屏幕宽度旋转木马插件，效果不错。
Movies板块，给一些图片加上超链接，点击好跳转外部链接。对图片的img的CSS中还引入了简单的wow.js动画。wow.js依赖animate.css，不需要jquery；animate.css是纯css动画。在放置鼠标在图片上之后，图片会在0.5s内完成缩小动画。这个板块中比较麻烦的是计算各个图片div的大小和放置位置，需要能够很好地契合。

![图片](https://user-images.githubusercontent.com/59997978/221739761-d705ec64-fbd7-44a1-8ee3-e5afe245b64d.png)

![图片](https://user-images.githubusercontent.com/59997978/221734970-bd25cd1a-f68a-436b-97c7-6565b900c672.png)

![图片](https://user-images.githubusercontent.com/59997978/221735065-f3a1ebb5-e443-4411-aa63-967bddf8d6d1.png)

