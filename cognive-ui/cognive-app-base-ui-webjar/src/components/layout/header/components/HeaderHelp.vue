<!-- Help component for header -->

<template>
  <span class="help">
    <icon-svg icon-name="icon_24_ic_info"/>
  </span>
</template>

<script>
    import IconSvg from "@/components/common/icons/IconSvg";

    export default {
      name: "HeaderHelp",
      components: {IconSvg}
    }
</script>

<style lang="scss" scoped>
  .help {
    margin-right: 8px;
  }
</style>
