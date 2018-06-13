define(function(require, exports, module){
    var requery = require('template/merchantsQuery.html');
    var exquery = Vue.extend({
        template:requery
    })
    module.exports = exquery;
})