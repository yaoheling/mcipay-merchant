 define(function (require, exports, module) {
 	var index_v2 = require('template/index_v2.html');
    var index2=Vue.extend({
 		template:index_v2
 	})	
	module.exports=index2;
 })