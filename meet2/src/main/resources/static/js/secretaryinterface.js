var Main = {
    data() {
      return {
        tableData: [{
        userid: '账号',
          name: '王小虎',
          meetingid: '分论坛1'
        }]
      }
    }
  }
var Ctor = Vue.extend(Main)
new Ctor().$mount('#secretary')