<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Tips for Good Health</title>
<%@include file="../component/allcss.jsp"%>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
<style>
  body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    background-color: #f3f3f3;
  }
  .titlebar {
    background-color: #2E8B57; /* Dark green */
    color: #fff;
    padding: 10px;
    text-align: center;
  }
  .tip-container {
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
    padding: 20px;
  }
  .tip {
    width: 80%;
    max-width: 600px;
    background-color: #fff;
    border-radius: 10px;
    padding: 20px;
    box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
    margin-bottom: 20px;
    position: relative;
    overflow: hidden;
    animation: slideUp 1s ease-in-out;
  }
  .tip h2 {
    margin-top: 0;
    color: #333;
  }
  .tip p {
    color: #666;
  }
  .icon {
    position: absolute;
    top: 10px;
    left: 10px;
    background-color: #2E8B57; /* Dark green */
    color: #fff;
    width: 40px;
    height: 40px;
    border-radius: 50%;
    display: flex;
    justify-content: center;
    align-items: center;
    font-size: 20px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
    z-index: 1;
  }
  .tip-content {
    padding-left: 60px;
  }
  @keyframes slideUp {
    from {
      transform: translateY(100%);
      opacity: 0;
    }
    to {
      transform: translateY(0);
      opacity: 1;
    }
  }
</style>
</head>
<body>
<%@include file="navbar1.jsp"%>
<div class="titlebar">
  <h1>Tips for Good Health</h1>
</div>

<div class="tip-container">
  <div class="tip">
    <div class="icon" style="background-color: #2E8B57;"><i class="fas fa-heart"></i></div>
    <div class="tip-content">
      <h2>Eat a Balanced Diet</h2>
      <p>Consume a variety of foods to ensure you get all the necessary nutrients your body needs.</p>
    </div>
  </div>

  <div class="tip">
    <div class="icon" style="background-color: #2E8B57;"><i class="fas fa-dumbbell"></i></div>
    <div class="tip-content">
      <h2>Stay Active</h2>
      <p>Engage in regular physical activity to maintain a healthy weight and improve overall well-being.</p>
    </div>
  </div>

  <div class="tip">
    <div class="icon" style="background-color: #2E8B57;"><i class="fas fa-glass-whiskey"></i></div>
    <div class="tip-content">
      <h2>Stay Hydrated</h2>
      <p>Drink plenty of water throughout the day to keep your body hydrated and functioning properly.</p>
    </div>
  </div>

  <div class="tip">
    <div class="icon" style="background-color: #2E8B57;"><i class="fas fa-bed"></i></div>
    <div class="tip-content">
      <h2>Get Adequate Sleep</h2>
      <p>Ensure you get enough quality sleep each night to recharge your body and mind.</p>
    </div>
  </div>

  <div class="tip">
    <div class="icon" style="background-color: #2E8B57;"><i class="fas fa-smile"></i></div>
    <div class="tip-content">
      <h2>Maintain a Positive Outlook</h2>
      <p>Practice stress-relief techniques and surround yourself with positivity for better mental health.</p>
    </div>
  </div>
</div>
<div class="col-md-3 pd-2">
    <img alt="" src="img/r1.jpg ">
</div>
</body>
</html>
