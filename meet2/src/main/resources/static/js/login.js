var registername;
var registerpassword;
var forum1=0;
function goback(){
  //返回没有登录的界面
  var i=document.getElementById("login");
  i.style.display="none";
};
function register(){
  var i=document.getElementById("mylogin");
  i.style.display="none";
  var j=document.getElementById("register");
  j.style.display="block";
};
var Main = {
    data() {
      var validatePass = (rule, value, callback) => {
        var zg =  /^[0-9a-zA-Z]*$/;
        if (value === '') {
          callback(new Error('请输入账号'));
        } else if(!zg.test(value)){
          callback(new Error('账号只能为字母和数字'));
        }else {
          if (this.ruleForm.checkPass !== '') {
            this.$refs.ruleForm.validateField('checkPass');
          }
          callback();
        }
      };
      var validatePass2 = (rule, value, callback) => {
        var zg =  /^[0-9a-zA-Z]*$/;
        if (value === '') {
          callback(new Error('请输入密码'));
        } else if(!zg.test(value)){
          callback(new Error('密码只能为字母和数字'));
        }else {
          callback();
        }
      };
      var validateage =(rule,value,callback)=>{
        //账号确定
        var zg =  /^[0-9a-zA-Z]*$/;
        if(value===''){
          callback(new Error('请输入账号'));
        }else if(!zg.test(value)){
          callback(new Error('账号只能为字母和数字'));
        }
      }
      var validatePass3 =(rule,value,callback)=>{
        //再次确定密码
        if(value===''){
          callback(new Error('请再次确定密码'));
        }else if(value !== this.registerForm.pass1){
          callback(new Error('两次输入密码不一致!'));
        }else {
          callback();
        }
      }
      var validatePass4 =(rule,value,callback)=>{
        //密码确定
        var zg =  /^[0-9a-zA-Z]*$/;
        if(value===''){
          callback(new Error('请输入密码'));
        }else if(!zg.test(value)){
          callback(new Error('密码只能为字母和数字'));
        }
      }
      return {
        checkboxGroup2: [],
        activeName: 'first',
        ruleForm: {
          pass: '',
          checkPass: '',
        },
        registerForm: {
          age:'',
          pass1: '',
          checkPass1: '',
        },
        rules: {
          pass: [
            { validator: validatePass, trigger: 'blur' }
          ],
          checkPass: [
            { validator: validatePass2, trigger: 'blur' }
          ],
          age: [
            { validator: validateage, trigger: 'blur' }
          ],
          checkPass1: [
            { validator: validatePass3, trigger: 'blur' }
          ],
          pass1: [
            { validator: validatePass4, trigger: 'blur' }
          ],
        }
      };
    },
    methods: {
      registersuccess(){
        var i=this.checkboxGroup2;
        if(i.length==2){
          forum1=3;
        }else if(i=="备选项1"){
          forum1=1;
        }else {
          fourm1=2;
        }
  var s=registername+"+"+registerpassword+"+"+forum1;
  $.ajax(
    {
        url: 'register',
        type: 'post',
        data: s,
        }).then(function (res) 
        {
          console.log(res);
          window.location="/index";
        }).fail(function () 
        {
            console.log('失败');
        })
      },
      submitForm(formName) {
        //普通人的登录
        var password=this.ruleForm.checkPass;
        var name=this.ruleForm.pass;
        var k=name+"+"+password;
        $.ajax(
          {
              url: 'accessLoginN',
              type: 'post',
              data: k,
              }).then(function (res) 
              {
                  console.log(res);
                  if(res.code==1){
                    var i=res.user.meetingid;
                    if(i==1){
                      window.location="/userPage.html";
                    }else if(i==2){
                      window.location="/userPage_two.html";
                    }else {
                      window.location="/userPage_three.html";
                    }
                  }
                    else {
                      alert("登陆失败");
                    }

              }).fail(function () 
              {
                  console.log('失败');
              })
      },
      submitForm1(formName) {
        //主席 秘书啥的的登录
        var i=document.getElementById("secondtab");
        var j=document.getElementById("thirdtab");
        var m=document.getElementById("fourthtab");
        var password=this.ruleForm.checkPass;
        var name=this.ruleForm.pass;
        var k=name+"+"+password;
        $.ajax(
          {
              url: 'accessLoginP',
              type: 'post',
              data: k,
              }).then(function (res) 
              {
                
                console.log(res);
                if(res.code==1){
                if(!i.getAttribute("disabled")){
                  //主席登录
                  if(res.admin.name=="主席"){
                    //成功 跳转
                    window.location="/Chairman.html";
                  }else {
                    alert("登陆失败")
                  }
                }else if(!j.getAttribute("disabled")){
                  //分主席登录
                  if(res.admin.name=="分主席1"){
                    //成功 跳转分主席1
                    window.location="/littleChairman.html";
                  }else if(res.admin.name=="分主席2"){
                    //成功 跳转分主席2
                    window.location="/littleChairman2.html";
                  }else {
                    alert("登陆失败");
                  }
                }else {
                  //秘书登录
                  if(res.admin.name=="分会秘书1"){
                    //成功 跳转分会秘书1
                    window.location="/secretaryinterface.html";
                  }else if(res.admin.name=="分会秘书2"){
                    //成功 跳转分会秘书2
                    window.location="/secretaryinterface2.html";
                  }else {
                    alert("登陆失败");
                  }
                }}else {
                  alert("登陆失败");
                }
              }).fail(function () 
              {
                  console.log('失败');
              })
      },
      submitForm2(formName) {
        //注册的表单提交 跳转下一步 选择感兴趣的论坛
        var i=document.getElementById("selectfourm");
        i.style.display="block";
        var j=document.getElementById("register");
        j.style.display="none";
        registername=this.registerForm.age;
        registerpassword=this.registerForm.pass1;
      },
      resetForm(formName) {
        this.$refs[formName].resetFields();
      }
    }
  };
var Ctor = Vue.extend(Main)
new Ctor().$mount('#login')

function registersuccess(){
};
