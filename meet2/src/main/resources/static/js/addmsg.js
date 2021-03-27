
var href=window.location.search;
var word = href.substring(href.lastIndexOf('=')+1, href.length);
var region='';
var desc='';
var Main = {
    data() {
      return {
        form: {
          region: '',
          desc: ''
        }
      }
    },
    methods: {
      onSubmit() {
        var identity=this.form.region;
        var msg=this.form.desc;
        if(identity==1)
        {
          var k=['分主席'+word,msg];
        }
        else if(identity==2){
            var k=['分会秘书'+word,msg];
        }
        $.ajax(
          {
              url: '',
              type: 'get',
              data: k,
              }).then(function (res) 
              {
                alert("发布成功");　
                window.history.go(-1);
                　　　
              }).fail(function () 
              {
                alert("发布失败");　
                window.history.go(-1);
              })
      }
      
    }
  }
var Ctor = Vue.extend(Main)
new Ctor().$mount('#addmsg')