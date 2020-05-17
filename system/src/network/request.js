import axios from'axios'

export function request(config){
    const instance=axios.create({
        baseURL:'http://localhost:8080/test',
        timeout:5000
    })
    //请求拦截
    instance.interceptors.request.use(config=>{
        // console.log(config);
        return config
    },err => {
        // console.log(err);
    })
    //响应拦截
    instance.interceptors.response.use(res=>{
        // console.log(res);
        return res.data
    },error => {
        console.log(err);
    })
    // instance.interceptors.response
    return instance(config)
}



