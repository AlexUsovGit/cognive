<template>
  <div id="login">
    <router-view/>
  </div>
</template>

<script>
    export default {
        name: "LoginApp"
    }
</script>

<style lang="scss">
  @import "~bootstrap/scss/bootstrap";

  #login {
    @import "assets/styles/cognive";
  }
</style>
