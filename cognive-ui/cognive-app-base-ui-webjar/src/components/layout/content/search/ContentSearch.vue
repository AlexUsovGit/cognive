<!-- This is search content component. At the first stage customer application form will be shown. -->

<template>
  <div>
    <search-individual/>
  </div>
</template>

<script>
  import ContentSearchConfig from "@/../config/configs-temp/search"
  import SearchIndividual from "@/components/layout/content/search/SearchIndividual";

  export default {
    name: "ContentSearch",
    components: {SearchIndividual},
    data: function () {
      return {
        config: ContentSearchConfig
      }
    }
  }
</script>

<style lang="scss" scoped>

</style>
