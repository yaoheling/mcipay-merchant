 define(function (require, exports, module) {
 	var index_v4 = require('template/index_v4.html');
    var index4=Vue.extend({
 		template:index_v4
 	})
	module.exports=index4;
 })