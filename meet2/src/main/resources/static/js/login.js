var Main = {
    data() {
      var validatePass = (rule, value, callback) => {
        if (value === '') {
          callback(new Error('请输入账号'));
        } else {
          if (this.ruleForm.checkPass !== '') {
            this.$refs.ruleForm.validateField('checkPass');
          }
          callback();
        }
      };
      var validatePass2 = (rule, value, callback) => {
        if (value === '') {
          callback(new Error('请输入密码'));
        } else {
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
        var password=this.ruleForm.checkPass;
        var name=this.ruleForm.pass;
        var k=name+"+"+password;
        $.ajax(
          {
              url: '',
              type: 'get',
              data: k,
              }).then(function (res) 
              {
                alert(1);　　　　
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