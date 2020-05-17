import {request} from "./request";

export function getUserInfo(name, pwd) {
    return request({
        url: "/login",
        params:{
            name:name,
            pwd:pwd
        }
    })
}
export function getUserAll() {
    return request({
        url: "/User",

    })
}

export function getDataAll(year) {
    return request({
        url: "/DataAll",
        params:{
            year:year
        }
    })
}
//获取人口
export function getPopulation(year,province) {
    return request({
        url: "/Data",
        params:{
            year:year,
            province:province
        }
    })
}
//更新人口
export function setPopulation(year,province,gai) {
    return request({
        url: "/setPopulation",
        params:{
            year:year,
            province:province,
            gai:gai
        }
    })
}
export function registerUser(name, pwd) {
    return request({
        url: "/register",
        params:{
            name:name,
            pwd:pwd
        }
    })
}
export function dele(name) {
    return request({
        url: "/dele",
        params:{
            name:name,
        }
    })
}