define(function(require,exports,module){
	var router=new VueRouter({
		//history模式 去除地址栏"#" 但是页面刷新后 页面404     解决：  后台配置web.xml   本地调试 可注释mode
		 mode: 'history',
		 routes: [{
            path: '/index1',
            component:function(resolve){
            	require.async(['js/index_v1.js'],resolve);
        	}	
        }, {
            path: '/index2',
            component:function(resolve){
            	require.async(['js/index_v2.js'],resolve);
        	}
        }, {
            path: '/index3',
            component:function(resolve){
            	require.async(['js/index_v3.js'],resolve);
        	}
        }, {
            path: '/index4',
            component:function(resolve){
            	require.async(['js/index_v4.js'],resolve);
        	}
        }, {
            path: '/index5',
            component:function(resolve){
            	require.async(['js/index_v5.js'],resolve);
        	}
        }, {
             path: '/merquery',
             component:function(resolve){
                 require.async(['js/merquery.js'],resolve);
             }
         }, {
             path: '/mersettle',
             component:function(resolve){
                 require.async(['js/mersettle.js'],resolve);
             }
         }]
	});
	var App=new Vue({
	    el: "#wrapper",
	    router
	});
})

