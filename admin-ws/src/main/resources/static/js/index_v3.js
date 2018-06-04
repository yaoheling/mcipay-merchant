 define(function (require, exports, module) {
 	var index_v3 = require('template/index_v3.html');
    var index3=Vue.extend({
 		template:index_v3
 	})
	module.exports=index3;
 })