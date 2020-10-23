### 完成度：
* 功能缺陷较多，且影响比较严重。

__Details:__

- \- 默认的 user 查询时返回的 id 字段为 null。
- \- user id 不存在时应该返回 404，目前是 200。
- \- 创建 user 时没有校验 age。
- \- name 字段不存在时依然可以创建 user。
- \- 新创建的 user，在查询 educations 时，返回 1，应该是空数组。
- \- 给 新创建的 user 增加 educations 时，貌似都加到默认的 user 上去了。
- \- 创建 educations 时，description 字段不存在，但仍然创建成功了。

### 测试：
* 没有实现任何自动化测试。

__Details:__



### 知识点：
* Spring MVC 相关的知识点应用的不好。
* Optional API 掌握的不好。

__Details:__

- \- 用 @RestController 代替 @Controller + @ResponseBody
- \- 用 @PostMapping 代替 @RequestMapping(method = RequestMethod.POST)
- \- 查询 user 的 API 怎么能用 POST？Copy 过来的忘改了？
- \- 这里可以使用 Optional API

### 工程实践：
* clean code 欠缺明显。

__Details:__

- \- 太多的 userMap.size() + 1，且不建议用 map.size() 来生成 userId
- \- UserService.java:18 下面这些 map 或者 list 通常会被提取到 Repository 中去。这不属于 UserService 的职责。
- \- 可以用 return early pattern 改进这里的代码。
- \- 没有 .gitignore 文件，构建后产生很多无谓的变更。

### 综合：
* 从功能实现到知识点再到工程实践，这次的表现都不太好，需要多加注意。

__Details:__



