const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot4prsj/",
            name: "springboot4prsj",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot4prsj/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "作业管理系统"
        } 
    }
}
export default base
