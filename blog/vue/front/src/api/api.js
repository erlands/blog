// dev
// let baseUrl = 'http://localhost:8083'
// prod
let baseUrl = 'http://api.tohsaka.top'
function getUrl (uri) {
    return baseUrl + uri
}

export const postListApi = getUrl('/post/list')

export const tagListApi = getUrl('/tag/list')

export const articleApi = getUrl('/article')
