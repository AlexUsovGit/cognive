<!-- 403 error page -->

<template>
  <div class="container-fluid">
    <div class="row align-items-center text-center">
      <div class="col">
        <h1 class="title">
          Error: 403 Access Forbidden
        </h1>
        <p class="content d-inline-flex justify-content-center">
          4
          <span class="letter-o"></span>
          3
        </p>
        <p class="description">
          The page or resource you were trying to reach is forbidden for some reason.<br/>
          You can return to the
          <router-link :to="{name: 'Home'}">
            home page
          </router-link>
          or
          <router-link :to="{name: 'Home'}">
            contact support
          </router-link>
          .
        </p>
      </div>
    </div>
  </div>
</template>

<script>
    export default {
        name: "Error403"
    }
</script>

<style lang="scss" scoped>
  @import "../../assets/styles/core/core";

  $height-content: 360px;

  .row {
    min-height: 100vh;
    background-color: $color-background;
  }
  .title {
    font-size: 40px;
    font-weight: 600;
    color: $color-text-bold;
  }
  .content {
    width: 100%;
    height: $height-content;
    line-height: $height-content;
    font-size: $height-content;
    font-weight: bold;
    color: $color-main-violet-blue;
    background: {
      image: url("../../assets/images/error-403-background.png");
      repeat: no-repeat;
      position: center;
    }
  }
  .letter-o {
    width: 258px;
    background: {
      image: url("../../assets/images/error-403-o.png");
      repeat: no-repeat;
      position: center;
    }
  }
  .description {
    font-size: 16px;
    font-weight: 600;
    color: $color-text-main;
    margin-top: 30px;
  }
</style>
