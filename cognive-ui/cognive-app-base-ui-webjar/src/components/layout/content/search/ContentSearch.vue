<!-- This is search content component. At the first stage customer application form will be shown. -->

<template>
  <div>
    <tabs-component :tabs="config.contentSearch.tabs"/>
  </div>
</template>

<script>
  import ContentSearchConfig from "@/../config/configs-temp/search"
  import TabsComponent from "@/components/common/tabs/TabsComponent";

  export default {
    name: "ContentSearch",
    components: {TabsComponent},
    data: function () {
      return {
        config: ContentSearchConfig
      }
    }
  }
</script>

<style lang="scss" scoped>

</style>
