<!-- User component for header -->

<template>
  <span class="user">
    <img
      src="../../../../assets/images/temp-avatar-alice.png"
      class="avatar"
    />
    Alice Sanders
  </span>
</template>

<script>
    export default {
        name: "HeaderUser"
    }
</script>

<style lang="scss" scoped>
  @import "../../../../assets/styles/core/core";

  .user {
    font-size: 12px;
    font-weight: bold;
    color: $color-text-bold;
  }
  .avatar {
    margin-right: 8px;
  }
</style>
