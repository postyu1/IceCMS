<template>
    <svg class="svg-icon" :class="iconName" aria-hidden="true">
        <use :xlink:href="iconName" :fill="color" />
    </svg>
</template>
<script>
export default {
    props: {
        iconName: {
            type: String,
            required: true
        },
        className: {
            type: String,
            default: ''
        },
        color: {
            type: String,
            default: ''
        }
    },
    
}
</script>
<style scoped>
.svg-icon {
    width: 1em;
    height: 1em;
    position: relative;
    fill: currentColor;
    vertical-align: -2px;
}
</style>