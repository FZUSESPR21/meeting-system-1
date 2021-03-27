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
      return {
        activeName: 'first',
        ruleForm: {
          pass: '',
          checkPass: '',
        },
        rules: {
          pass: [
            { validator: validatePass, trigger: 'blur' }
          ],
          checkPass: [
            { validator: validatePass2, trigger: 'blur' }
          ],
        }
      };
    },
    methods: {
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
              }).fail(function () 
              {
                  console.log('失败');
              })
      },
      submitForm1(formName) {
        //主席 秘书啥的的登录
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
                console.log(res)　　　
              }).fail(function () 
              {
                  console.log('失败');
              })
      },
      resetForm(formName) {
        this.$refs[formName].resetFields();
      }
    }
  };
var Ctor = Vue.extend(Main)
new Ctor().$mount('#login')