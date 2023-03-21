<template>

    <v-card outlined>
        <v-card-title>
            PickupMemu
        </v-card-title>

        <v-card-text>
            <Boolean label="Pickup" v-model="value.pickup" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="pickupMemu"
            >
                PickupMemu
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'PickupMemuCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.pickup = false;
        },
        watch: {
        },
        methods: {
            pickupMemu() {
                this.$emit('pickupMemu', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

