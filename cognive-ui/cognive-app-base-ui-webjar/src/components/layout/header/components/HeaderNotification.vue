<!-- Notification component for header -->

<template>
  <span class="notification">
    <icon-svg icon-name="icon_24_ic_notifications_1"/>
    <span
      v-if="count > 0"
      class="counter-component"
    >
      <badge-component :counter="count"/>
    </span>
  </span>
</template>

<script>
    import IconSvg from "@/components/common/icons/IconSvg";
    import BadgeComponent from "@/components/common/BadgeComponent";

    export default {
      name: "HeaderNotification",
      components: {BadgeComponent, IconSvg},
      data: function () {
        return {
          count: 2
        }
      }
    }
</script>

<style lang="scss" scoped>
  @import "../../../../assets/styles/core/core";

  .notification {
    position: relative;
    margin-right: 8px;
  }
  .counter-component {
    position: absolute;
    bottom: 12px;
    right: 12px;
  }
</style>
