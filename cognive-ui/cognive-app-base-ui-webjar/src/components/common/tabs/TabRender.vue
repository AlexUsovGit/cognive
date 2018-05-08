<!-- This is Tab render component. It gets name of component and renders its template. -->

<script>
    export default {
      name: "TabRender",
      props: {
        componentName: {
          type: String,
          required: true
        }
      },
      render: function (createElement) {
        return createElement(this.componentName);
      }
    }
</script>

<style scoped>

</style>
