var tableData = [];
window.onload = function(){
    $.ajax(
        {
            url: '',
            type: 'get',
            data: {},
            dataType: 'json'
        }).then(function (res)
    {
        for (var i in res)
        {
            tableData.push(res[i])  //把从json获取的数据赋值给数组
        }
    }).fail(function ()
    {
        console.log('失败');
    })
}

var Main = {
    data() {
      return {
        tableData
      }
    }
  }

  function turn(){
      window.open('test.html');
  }
var Ctor = Vue.extend(Main)
new Ctor().$mount('#secretary')