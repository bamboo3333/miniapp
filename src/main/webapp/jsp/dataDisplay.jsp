<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="menu.jsp"></jsp:include>

<html>
<head>
    <meta charset="utf-8">
    <title>success</title>
    <script src="../js/echarts.min.js"></script>
    <script src="../js/jquery-3.3.1.min.js" type="text/javascript"></script>

</head>
<style>
    #job{
        top: 10px;
        left: 20px;
    }
    .table>tbody>tr>td{    border:0px;    }
</style>
<body>
<%--<span>${jobType[0].type}</span>--%>
<table class="table table-striped">
    <tr>
        <td>
            <!--实习信息数据展示-->
            <div id="job" style="width: 660px;height: 400px"></div>
        </td>
        <td>
            <!--招聘公司排行榜-->
            <div id="company" style="width: 660px;height: 400px"></div>
        </td>
    </tr>
    <tr>
        <td>
            <!--用户活跃量展示-->
            <div id="user" style="width: 660px;height: 400px"></div>
        </td>
        <td>
            <!--招聘公司排行榜-->
            <div id="job_type" style="width: 660px;height: 400px"></div>
        </td>
    </tr>

</table>


<script type="text/javascript">

    var dom = document.getElementById("job");
    var myChart = echarts.init(dom);
    var app = {};
    option = null;
    option = {
        title: {
            text: '招聘信息统计',
            left: '28%',
            textStyle:{
                color: '#FFFFFF'
            }
        },
        tooltip: {
            trigger: 'item',
            formatter: '{a} <br/>{b} : {c} ({d}%)'
        },
        legend: {
            orient: 'vertical',
            left: 'left',
            data: [
                <c:forEach items="${jobType}" var="job">
                    {name:'${job.type}',textStyle:{color:'#FFFFFF'}},
                </c:forEach>
            ]
        },
        series: [
            {
                name: '招聘类型',
                type: 'pie',
                radius: '55%',
                center: ['35%', '50%'],
                data: [
                    {value: ${jobType[0].jobNum}, name: '${jobType[0].type}'},
                    {value: ${jobType[1].jobNum}, name: '${jobType[1].type}',itemStyle:{color:'#F4C638'}},
                    {value: ${jobType[2].jobNum}, name: '${jobType[2].type}',itemStyle:{color:'#3FA7DC'}}

                ],
                emphasis: {
                    itemStyle: {
                        shadowBlur: 10,
                        shadowOffsetX: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                }
            }
        ]
    };
    if (option && typeof option === "object") {
        myChart.setOption(option, true);
    }
</script>
<script type="text/javascript">
    var comName = [],comNum = [];

    <c:forEach items="${companys}" var="company">
        comName.push('${company.comName}');
        comNum.push(${company.comNum});
    </c:forEach>
    var dom = document.getElementById("company");
    var myChart = echarts.init(dom);
    var app = {};
    option = null;
    option = {
        title: {
            text: '热门招聘公司排行榜',
            left: 'center',
            textStyle:{
                color:'#FFFFFF'
            }

        },

        color: ['#3398DB'],
        tooltip: {
            trigger: 'axis',
            axisPointer: {            // 坐标轴指示器，坐标轴触发有效
                type: 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
            }
        },
        grid: {
            left: '3%',
            right: '4%',
            bottom: '3%',
            containLabel: true
        },
        xAxis: [
            {
                type: 'category',
                data: comName,
                axisTick: {
                    alignWithLabel: true
                },
                axisLabel: {
                    textStyle: {
                        color: '#3FA7DC',//坐标值得具体的颜色

                    }
                }
            }
        ],
        yAxis: [
            {
                type: 'value',
                axisLabel: {
                    textStyle: {
                        color: '#3FA7DC',//坐标值得具体的颜色

                    }
                }
            }
        ],
        series: [
            {
                name: '累计发布',
                type: 'bar',
                barWidth: '60%',
                data: comNum
            }
        ]
    };
    if (option && typeof option === "object") {
        myChart.setOption(option, true);
    }
</script>
<script type="text/javascript">
    var dom = document.getElementById("user");
    var myChart = echarts.init(dom);
    var app = {};
    option = null;
    option = {
        title: {
            text: '用户月活跃量',
            left: 'center',
            textStyle:{
                color:'#FFFFFF',
            },

        },
        tooltip: {
            trigger: 'item',
            formatter: '{a} <br/>{b} : {c}'
        },
        xAxis: {
            type: 'category',
            data: ['一月', '二月', '三月', '四月', '五月', '六月', '七月','八月','九月','十月','十一月','十二月'],
            axisLabel: {
                textStyle: {
                    color: '#C75450',//坐标值得具体的颜色

                }
            }
        },
        yAxis: {
            type: 'value',
            axisLabel: {
                textStyle: {
                    color: '#C75450',//坐标值得具体的颜色

                }
            }
        },
        series: [{
            name: '月活跃量',
            data: [820, 932, 901, 934, 1290, 1330, 1320],
            type: 'line'
        }]
    };
    ;
    if (option && typeof option === "object") {
        myChart.setOption(option, true);
    }
</script>
<script type="text/javascript">
    var posName = [],posNum = [];
    var colors = ['#DD2222','#3FA7DC','#61A0A8','#57C43C','#C4C43C'];
    var dom = document.getElementById("job_type");
    var myChart = echarts.init(dom);
    var app = {};
    option = null;
    option = {
        title: {
            text: '招聘岗位统计',
            left: 'center',
            textStyle:{
                color:'#FFFFFF',
            },

        },
        tooltip: {
            trigger: 'item',
            formatter: '{a} <br/>{b}: {c} ({d}%)'
        },
        legend: {
            orient: 'vertical',
            left: 10,
            data: [
                <c:forEach items="${positions}" var="position">
                    {name:'${position.key}',textStyle:{color:'#FFFFFF'}},
                </c:forEach>
            ]
        },
        series: [
            {
                name: '数量',
                type: 'pie',
                radius: ['50%', '70%'],
                avoidLabelOverlap: false,
                label: {
                    show: false,
                    position: 'center'
                },
                emphasis: {
                    label: {
                        show: true,
                        fontSize: '30',
                        fontWeight: 'bold'
                    }
                },
                labelLine: {
                    show: false
                },
                data: [
                    <c:forEach items="${positions}" var="position" varStatus="status">
                    {value: ${position.value}, name: '${position.key}',itemStyle:{color:colors[${status.index}]}},
                    </c:forEach>
                ]
            }
        ]
    };
    ;
    if (option && typeof option === "object") {
        myChart.setOption(option, true);
    }
</script>

</body>
</html>
