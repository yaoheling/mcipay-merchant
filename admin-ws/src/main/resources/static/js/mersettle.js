define(function(require, exports, module){
    var resettle = require('template/merchantsSettlement.html');
    var exsettle = Vue.extend({
        template:resettle
    })
    module.exports = exsettle;
})