// miniprogram/pages/index/index/index.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    isInput:false,
    inputData:"",
    number:0,
    inputValue:""
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {

  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  },

  /**
   *   输入招聘新闻标题，匹配数据。并显示出来给用户，进行提示
   * 需要传入的数据
   * 更具输入的数据
   * data{}
   */
  inputHireNewsTitle:function(e){
    let that = this;
    that.setData({
      inputData: e.detail.value,
      isInput:true,
      number:2
    });
  },

  /**
   * 回车事件，通过回车进行数据获取
   */
  onShow:function(e){
      let that =this;
      that.setData({
        inputValue:"",
        isInput:false
      });
      console.log("hh");
  },

  /**
   * 
   */



})