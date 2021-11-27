# sound
|- App
|- common                    //全系统公共使用的内容，作为基础类库存在
   |- aspect                 //AOP
   |- constant               //静态常量
   |- configuration          //基础配置类
   |- exception              //异常处理类
   |- filter                 //过滤器
   |- utils                  //常用工具类
     |- zip                  //zip处理
     |- excel                //excel处理
|- module
   |- authority              //系统权限管理模块
     |- permission           //权限管理
     |- role                 //角色管理
     |- authorize            //授权管理
   |- organization           //组织机构管理
     |- group                //组织
     |- user                 //用户
       |- controller         // 存放所有controller接口
       |- entity             // 存放持久层对象
       |- dto                // 存放数据传输对象
       |- service            // 存放服务接口和实现类
          |- impl
       |- mapper             // 存放数据库映射文件
   |- 其他功能模块
|- example             //博客中springboot功能使用示例代码
