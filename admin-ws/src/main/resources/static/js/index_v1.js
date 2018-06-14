 define(function (require, exports, module) {
 	var index_v1 = require('template/index_v1.html');
    var index1=Vue.extend({
 		template:index_v1,
 		data(){
 			return{
 				msg:"这是index_v1的一条数据,通过data数据显示出来的"
 			}
 		},
 		methods:{
 			goIndexV5(){
 				this.$router.push("/index5");
 			}
 		},
 		created(){
 			
 		},
 		mounted(){
 			
 		}
 	})
	module.exports=index1;
 })