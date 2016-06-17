/**
 * Created by aaron on 6/18/2016.
 */

Ext.Loader.setConfig({
    enabled: true
});

Ext.require('Ext.direct.*', function() {
    Ext.direct.Manager.addProvider(Ext.app.REMOTING_API);
});

Ext.application({
    controllers : [ 'sample'], //与第12个步骤中文件名一致
    //    autoCreateViewport : true,
    name : 'Mtx', //应用名，可以任取，不重复即可
    appFolder: 'resources/app', //这里配置当前应用下你的ExtJs MVC代码的存放路径

    launch : function() {
        Ext.create('Ext.container.Viewport', {
            items : [ {
                xtype : 'sampleList', //参考第11步中的视图别名
                layout : 'fit',
                margins: 5
            } ]
        });
    }
});

